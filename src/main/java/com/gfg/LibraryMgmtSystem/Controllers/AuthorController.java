package com.gfg.LibraryMgmtSystem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.gfg.LibraryMgmtSystem.Services.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	AuthorService authorService;
	
}
