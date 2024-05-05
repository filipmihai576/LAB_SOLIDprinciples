import org.json.JSONArray;
import org.json.JSONObject;

public class EquationSolver {
    public JSONObject solve(double a, double b) {
        JSONObject result = new JSONObject();
        try {
            result.put("type", "linear");

            JSONArray solutionsArray = new JSONArray();

            if (a == 0) {
                // Ecuația are un coeficient a egal cu zero
                JSONObject noSolution = new JSONObject();
                noSolution.put("type", "none");
                noSolution.put("description", "The equation has no solutions");
                solutionsArray.put(noSolution);
            } else {
                // Ecuația este de gradul I
                JSONObject uniqueSolution = new JSONObject();
                double solution = -b / a;
                uniqueSolution.put("type", "unique");
                uniqueSolution.put("value", solution);
                solutionsArray.put(uniqueSolution);

                // Ecuația are o infinitate de soluții
                JSONObject infiniteSolutions = new JSONObject();
                infiniteSolutions.put("type", "infinite");
                infiniteSolutions.put("description", "The equation has an infinite number of solutions");
                solutionsArray.put(infiniteSolutions);
            }

            result.put("solutions", solutionsArray);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        return result;
    }
}
