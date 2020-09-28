package racas;

import racas.BeneficiosDeRaca;
import racas.Raca;

public class Humano extends Raca {
    private Humano(){
        this.setNome("Humano");
        this.setIdadeMaxima(80);
        this.setDescricao("Valentes não fogem de boas aventuras.");

        BeneficiosDeRaca beneficios = this.gerarBeneficiosDeHumano();

        this.setBeneficios(beneficios);

    }

    private BeneficiosDeRaca gerarBeneficiosDeHumano(){
        BeneficiosDeRaca beneficiosHumano = new BeneficiosDeRaca();
        beneficiosHumano.setBeneficioCarisma(1);
        beneficiosHumano.setBeneficioDestreza(1);
        beneficiosHumano.setBeneficioSabedoria(1);
        beneficiosHumano.setBeneficioConstituicao(1);
        beneficiosHumano.setBeneficioForca(1);
        beneficiosHumano.setBeneficioInteligencia(1);

        return beneficiosHumano;
    }
}
