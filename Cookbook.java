public class Cookbook {
	private ArrayList recipeList;
	public void standardise(int numPeople) {
		int j = 0;
		while (j < recipeList.size()) {
			for (int k : recipeList) {
				(Ingredient) recipeList.get(j).getIngredients().get(k).scale(newAmount);
			}
			j++
		}
	}
}