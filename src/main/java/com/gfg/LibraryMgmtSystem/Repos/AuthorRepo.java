package com.gfg.LibraryMgmtSystem.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gfg.LibraryMgmtSystem.Models.Author;

public interface AuthorRepo extends JpaRepository<Author,Integer> {

}
