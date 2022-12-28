package Model;

public class Curso extends Conteudo {
    private double cargaHoraria;

    public Curso(String titulo, String descricao, double cargaHoraria) {
        setDescricao(descricao);
        setTitulo(titulo);
        this.cargaHoraria = cargaHoraria;

    }
    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 30d;
    }


}
