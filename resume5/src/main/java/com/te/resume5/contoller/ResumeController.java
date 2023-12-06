package com.te.resume5.contoller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.resume5.beans.EducationInfo;
import com.te.resume5.beans.ExperienceDetails;
import com.te.resume5.beans.ExtraDetails;
import com.te.resume5.beans.PersonalDetails;
import com.te.resume5.beans.ProjectDetails;
import com.te.resume5.beans.ResumeResponse;
import com.te.resume5.beans.UserRegister;
import com.te.resume5.service.EducationInfoService;
import com.te.resume5.service.ExperienceDetailsService;
import com.te.resume5.service.ExtraDetailsService;
import com.te.resume5.service.PersonalDetailsService;
import com.te.resume5.service.ProjectDetailsService;
import com.te.resume5.service.RegisterService;

@RestController
public class ResumeController {

	@Autowired
	private RegisterService service;
	
	@Autowired
	private PersonalDetailsService personalService;
	
	@Autowired
	private EducationInfoService educationService;
	
	@Autowired
	private ExperienceDetailsService experienceService;
	
	@Autowired
	private ProjectDetailsService projectService;
	
	@Autowired
	private ExtraDetailsService extraService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Init");
		CustomDateEditor dateEditor = 
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}
	
	@PostMapping(path = "/register")
	public ResponseEntity<ResumeResponse> storeData(@Valid @RequestBody UserRegister info) {
		ResumeResponse response = new ResumeResponse(false, service.register(info));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<ResumeResponse> login(@RequestBody UserRegister login) {
		ResumeResponse response = new ResumeResponse(false, service.login(login.getEmail(), login.getPassword()));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerpersonal")
	public ResponseEntity<ResumeResponse> storeDataPersonal(@Valid @RequestBody PersonalDetails personalDetails) {
		ResumeResponse response = new ResumeResponse(false, personalService.registerPersonalDetails(personalDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registereducation")
	public ResponseEntity<ResumeResponse> storeDataEducation(@Valid @RequestBody List<EducationInfo> educationinfo) {
		ResumeResponse response = new ResumeResponse(false, educationService.registerEducationInfo(educationinfo));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerexperience")
	public ResponseEntity<ResumeResponse> storeDataExperience(@Valid @RequestBody List<ExperienceDetails> experienceDetails) {
		ResumeResponse response = new ResumeResponse(false, experienceService.registerExperienceDetails(experienceDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerproject")
	public ResponseEntity<ResumeResponse> storeDataProject(@Valid @RequestBody List<ProjectDetails> projectDetails) {
		ResumeResponse response = new ResumeResponse(false, projectService.registerProjectDetails(projectDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerextra")
	public ResponseEntity<ResumeResponse> storeDataExtra(@Valid @RequestBody List<ExtraDetails> extraDetails) {
		ResumeResponse response = new ResumeResponse(false, extraService.registerExtraDetails(extraDetails));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
	
	@GetMapping(path = "/getdata/{user_id}")
	public ResponseEntity<ResumeResponse> getUser(@Valid @PathVariable Integer user_id) {
		ResumeResponse response = new ResumeResponse(false, personalService.getUser(user_id));
		return new ResponseEntity<ResumeResponse>(response, HttpStatus.OK);
	}
}
