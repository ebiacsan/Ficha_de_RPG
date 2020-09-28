package racas;

import racas.Raca;

public class MeioElfo extends Raca {
    public MeioElfo(){
        this.setNome("Meio Elfo");
        this.setIdadeMaxima(170);
        this.setDescricao("Filhos de pais de raças diferentes, sendo um deles elfo.");

        BeneficiosDeRaca beneficios = this.gerarBeneficiosDeMeioElfo();

        this.setBeneficios(beneficios);
    }

    private BeneficiosDeRaca gerarBeneficiosDeMeioElfo(){
        BeneficiosDeRaca beneficiosElfo = new BeneficiosDeRaca();
        beneficiosElfo.setBeneficioCarisma(2);
        beneficiosElfo.setBeneficioDestreza(1);
        beneficiosElfo.setBeneficioSabedoria(1);
        beneficiosElfo.setBeneficioConstituicao(0);
        beneficiosElfo.setBeneficioForca(0);
        beneficiosElfo.setBeneficioInteligencia(0);

        return beneficiosElfo;
    }
}
