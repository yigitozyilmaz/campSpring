package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandServices;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController //annotation
@RequestMapping ("/api/brands")
public class BrandsController {
	private BrandServices brandService;
	
	@Autowired
	public BrandsController(BrandServices brandService) {
		this.brandService = brandService;
	}

		@GetMapping ("/getall")
		public List<Brand> getAll(){ 
			return brandService.getAll();
		}
	}


