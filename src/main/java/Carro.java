import java.util.Arrays;
import java.util.Objects;

public class Carro {
    private Boolean ligado;
    private Integer velocidadeAtual;
    private String dono;
    private String[] donos;

    private int quantidadeDePneus;
    private int quantidadeAssentos;

    public Carro(Boolean ligado, Integer velocidadeAtual, String dono, String[] donos, int quantidadeDePneus){
        this.ligado = ligado;
        this.velocidadeAtual = velocidadeAtual;
        this.dono = dono;
        this.donos = donos;
        this.quantidadeDePneus = quantidadeDePneus;
    }

    public Carro(Boolean ligado, Integer velocidadeAtual, String dono, String[] donos, int quantidadeDePneus, int quantidadeAssentos) {
        this.ligado = ligado;
        this.velocidadeAtual = velocidadeAtual;
        this.dono = dono;
        this.donos = donos;
        this.quantidadeDePneus = quantidadeDePneus;
        this.quantidadeAssentos = quantidadeAssentos;
    }

    public void acelerar() {
        this.velocidadeAtual += 10;
    }

    public void ligarCarro() {
        this.ligado = true;
    }

    public void desligarCarro() {
        this.ligado = false;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String[] getDonos() {
        return donos;
    }

    public void setDonos(String[] donos) {
        this.donos = donos;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public int getQuantidadeDePneus() {
        return quantidadeDePneus;
    }

    public void setQuantidadeDePneus(int quantidadeDePneus) {
        this.quantidadeDePneus = quantidadeDePneus;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }

    public void setQuantidadeAssentos(int quantidadeAssentos) {
        this.quantidadeAssentos = quantidadeAssentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(ligado, carro.ligado) && Objects.equals(velocidadeAtual, carro.velocidadeAtual) && Objects.equals(dono, carro.dono) && Arrays.equals(donos, carro.donos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(ligado, velocidadeAtual, dono);
        result = 31 * result + Arrays.hashCode(donos);
        return result;
    }
}
