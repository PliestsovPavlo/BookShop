package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Author;
import ua.repository.AuthorRepository;
import ua.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{
	
	private final AuthorRepository authorRepository;

	@Autowired
	public AuthorServiceImpl(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@Override
	public void save(Author author) {

		authorRepository.save(author);
	}

	@Override
	public void delete(int id) {

		authorRepository.delete(id);
	}

	@Override
	public Author findOne(int id) {
		return authorRepository.findOne(id);
	}

	@Override
	public List<Author> findAll() {
		return authorRepository.findAll();
	}
	
	

}
