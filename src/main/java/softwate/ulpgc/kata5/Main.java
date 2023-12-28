package softwate.ulpgc.kata5;

import spark.Spark;

public class Main {
    public static void main(String[] args) {
        Spark.port(8080);
        Spark.get("/factorial", ((req, res) -> new Command()));
    }
}