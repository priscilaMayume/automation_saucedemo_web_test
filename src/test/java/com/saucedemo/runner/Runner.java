package com.saucedemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Localização dos arquivos .feature
        glue = "com.saucedemo.stepdefinitions",   // Localização das classes de StepDefinitions
        plugin = {
                "pretty",                            // Relatório de execução em formato legível
                "html:target/report-html",            // Relatório HTML
                "json:target/report.json"            // Relatório JSON
        },
        monochrome = true,                        // Faz o terminal mais legível
        //   snippets = io.cucumber.junit.SnippetType.CAMELCASE, // Configuração do estilo dos snippets
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,                          // Se estiver true, verifica se as steps estão mapeadas, sem rodar os testes
        strict = true                             // Garante que todas as steps sejam mapeadas corretamente
)
public class Runner {
    // Não há necessidade de código adicional, o JUnit executa os testes.
}
