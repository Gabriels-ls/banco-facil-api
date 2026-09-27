package com.unifebe.devsecops.config;

// Em producao, estes valores vem de um cofre de segredos (Vault, AWS Secrets Manager),
// nao do GITHUB_TOKEN, que e um segredo de CI/build e nao de runtime.
public class AppConfig {

    public static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

    public static final String AWS_ACCESS_KEY_ID = System.getenv("AWS_ACCESS_KEY_ID");
    public static final String AWS_SECRET_ACCESS_KEY = System.getenv("AWS_SECRET_ACCESS_KEY");

    public static final String PAYMENT_GATEWAY_API_KEY = System.getenv("PAYMENT_GATEWAY_API_KEY");

}
