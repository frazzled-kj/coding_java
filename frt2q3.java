public class Recipe {
	String recipeName;
	Arraylist <String> ingredientsList;
	String description;
	int numOfPeopleServed;

	public Recipe(Striing name,int peopleServed)  {
		//implementation not shown
	}

	public void addIngredient(String ingredient) {
		//implementation not shown
	}

	public void setDescription(String description) {
		//implementation not shown
	}

	public String getName() {
		//implementation not shown
	}

	public Arraylist<Ingredient> getIngredients() {
		//implementation not shown
	}

	public int getNumOfPeople() {
		//implementation not shown
	}

	public void changeIngredientProportions(int newNumPeople)  {
		for (int i : ingredientsList) {
			double oldAmount = (Ingredient) ingredientsList.get(k).getAmount();
			double newAmount = (oldAmount * newNumPeople) / numOfPeopleServed;
			ingredientsList.get(k).setAmount(newAmount);
		}
		numOfPeopleServed= newNumPeople;
	}
}

public void standardise(int numPeople) {
	int j = 0;
	while (j < recipeList.size()) {
		for (int k : recipeList) {
			(Ingredient) recipeList.get(j).getIngredients().get(k).scale(newAmount);
		}
		j++
	}
}

