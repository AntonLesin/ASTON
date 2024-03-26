public class Bowl {
    public int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }

    public void addFood(int foodAmount) {
        this.foodAmount += foodAmount;
    }
}
