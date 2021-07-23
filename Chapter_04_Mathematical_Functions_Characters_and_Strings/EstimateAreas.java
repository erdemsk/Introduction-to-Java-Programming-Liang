/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.3, 173*/
public class EstimateAreas {
    public static void main(String[] args) {
        //GPS locations of following cities obtained from the page 142
        double atlantaX = 33.7489954;
        double atlantaY = -84.3879824;
        double charlotteX = 33.7489954;
        double charlotteY = -84.3879824;
        double savannahX = 32.0835407;
        double savannahY = -81.0998342;
        double orlandoX = 28.5383355;
        double orlandoY = -81.3792365;

        //calculate the distance between Orlando and Charlotte and this line is going to create two triangles.
        double distanceFromOrlandoToCharlotte = Math.sqrt(Math.pow(orlandoX - charlotteX, 2) + Math.pow(orlandoY - charlotteY, 2));

        //calculate the distance between the cities that sit on the edges of the polygon
        double distanceFromOrlandoToAtlanta = Math.sqrt(Math.pow(orlandoX - atlantaX, 2) + Math.pow(orlandoY - atlantaY, 2));
        double distanceFromAtlantaToCharlotte = Math.sqrt(Math.pow(atlantaX - charlotteX, 2) + Math.pow(atlantaY - charlotteY, 2));
        double distanceFromOrlandoToSavannah = Math.sqrt(Math.pow(orlandoX - savannahX, 2) + Math.pow(orlandoY - savannahY, 2));
        double distanceFromSavannahToCharlotte = Math.sqrt(Math.pow(savannahX - charlotteX, 2) + Math.pow(savannahY - charlotteY, 2));

        //Calculate the area of the triangular region whose vertices are Atlanta, Orlando, and Charlotte
        double s1 = (distanceFromOrlandoToAtlanta + distanceFromOrlandoToCharlotte + distanceFromAtlantaToCharlotte) / 2;
        double areaBetweenAtlantaOrlandoAndCharlotte = Math.sqrt(s1 * (s1 - distanceFromOrlandoToAtlanta) * (s1 - distanceFromOrlandoToCharlotte) * (s1 - distanceFromAtlantaToCharlotte));

        //Calculate the area of the triangular region whose vertices are Savannah, Orlando, and Charlotte
        double s2 = (distanceFromOrlandoToSavannah + distanceFromOrlandoToCharlotte + distanceFromSavannahToCharlotte) / 2;
        double areaBetweenSavannahOrlandoAndCharlotte = Math.sqrt(s2 * (s2 - distanceFromOrlandoToSavannah) * (s2 - distanceFromSavannahToCharlotte) * (s2 - distanceFromOrlandoToCharlotte));

        //calculate the total area
        double totalArea = areaBetweenAtlantaOrlandoAndCharlotte + areaBetweenSavannahOrlandoAndCharlotte;

        //display the result
        System.out.println("GPS locations of: ");
        System.out.println("Atlanta (33.7489954, -84.3879824)");
        System.out.println("Charlotte (33.7489954, -84.3879824)");
        System.out.println("Savannah (32.0835407, -81.0998342)");
        System.out.println("Orlando (28.5383355, -81.3792365)");
        System.out.println("Total area between Atlanta, Orlando, Charlotte and Savannah is: " + totalArea);
    }
}
