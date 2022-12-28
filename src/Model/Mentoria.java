package Model;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(Bootcamp bootcamp) {

        this.data = bootcamp.getDataInicio().plusDays(7);

    };




    public LocalDate getData() {

        return this.data;
    }

    public void setData(LocalDate data) {

        this.data = data;
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
