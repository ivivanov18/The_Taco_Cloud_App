package tacos;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import tacos.Ingredient.Type;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

	private final IngredientRepository ingredientRepository;
	
	public IngredientByIdConverter(IngredientRepository ingredientRepository) {
		this.ingredientRepository = ingredientRepository;
	}

	@Override
	public Ingredient convert(String id) {
		return this.ingredientRepository.findById(id).orElse(null);
	}
}
