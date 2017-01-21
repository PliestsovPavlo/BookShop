package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Basket;
import ua.repository.BasketRepository;
import ua.service.BasketService;

@Service
public class BasketServiceImpl implements BasketService{
	
	private final BasketRepository basketRepository;

	@Autowired
	public BasketServiceImpl(BasketRepository basketRepository) {
		this.basketRepository = basketRepository;
	}

	@Override
	public void save(Basket basket) {

		basketRepository.save(basket);
	}

	@Override
	public void delete(int id) {

		basketRepository.delete(id);
	}

	@Override
	public Basket findOne(int id) {
		return basketRepository.findOne(id);
	}

	@Override
	public List<Basket> findAll() {
		return basketRepository.findAll();
	}

}
