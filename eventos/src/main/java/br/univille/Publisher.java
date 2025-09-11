package br.univille;

import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class Publisher {
    public static void main(String[] args) {
        var topicName = "topic-das1-b";
        var servidro = "https://sbdas12025a.servicebus.windows.net/";

        //analisa as variáveis de ambiente para verificar se há usuário e senha ou token para se logar.
        DefaultAzureCredential credential = 
            new DefaultAzureCredentialBuilder().build();
    }
}
