import org.json.JSONObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți coeficientul a: ");
        double a = scanner.nextDouble();
        System.out.print("Introduceți coeficientul b: ");
        double b = scanner.nextDouble();

        EquationSolver solver = new EquationSolver();
        JSONObject solution = solver.solve(a, b);
        System.out.println("Soluția ecuației: " + solution.toString());
    }
}