public class PythagoreanTheorem {
    public double calculateHypotenuse(int legA, int legB) {
        
        double result = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        return result;
    }
}
