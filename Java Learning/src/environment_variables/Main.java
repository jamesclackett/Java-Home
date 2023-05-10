package environment_variables;

public class Main {
    public static void main(String[] args) {
        // Environment variables are system-wide variables
        // The global-est of global. Can be accessed by any process in the system.
        System.out.println(System.getenv().get("CATALINA_HOME"));
    }
}