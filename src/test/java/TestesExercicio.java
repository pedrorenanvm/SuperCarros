import org.junit.Assert;
import org.junit.Test;

public class TestesExercicio {
    /**
     *
     * Criar um carro com os atributos:
     *  - modelo
     *  - ligado
     *  - velocidadeAtual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Ligar/Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Só podemos realizar as ações com o carro ligado
     * - A velocidade máxima do nosso carro é de 100km/h
     * - Não existe velocidade negativa
     * - Acelerar + 10km/h (Aumenta 10)
     * - Frear - 10km/h (Diminui 10)
     *
     */
    // 2x AssertTrue = x
    // 2x AssertFalse = x
    // 1x AssertNull = x
    // 1x AssertNotNull = x
    // 2x AssertEquals - primitivo = x
    // 2x AssertEquals - object = x

    // 1x - AssertArrayEquals  = x
    // 1x - assertSame
    // 1x - assertNotSame
    @Test //Assert True
    public void verificarDeveIniciarLigado(){
        //Given
        Carro carro = new Carro(false, 0, null, null,4);
        //When
        carro.ligarCarro();
        //Then
        Assert.assertTrue(carro.getLigado());
    }

    @Test //Assert True
    public void verificarSeDonoJaFoiDono(){
        //Given
        Carro carro = new Carro(false, 0, null, null,4);
        //When
        carro.setDono("Igor");
        String [] donos = new String[]{"Pedro","Paulo","Igor","Jorge","Bruno"};
        carro.setDonos(donos);
        Boolean jafoiDono = false;
        for (String dono : donos) {
            if (dono.contains(carro.getDono())){
                jafoiDono = true;
            }
        }

        //Then
        Assert.assertTrue(jafoiDono);
    }

    @Test //Assert False
    public void verificarVelocidadeNegativa(){
        //Given
        Carro carro = new Carro(false, 0, null, null,4);
        //When
        carro.ligarCarro();
        carro.setVelocidadeAtual(-1);
        Boolean velocidadeNegativa =false;
        if (carro.getVelocidadeAtual() > 0) {
            velocidadeNegativa = true;
        }
        //Then
        Assert.assertFalse(velocidadeNegativa);
    }

    @Test //Assert False
    public void verificar(){
        //Given
        Carro carro = new Carro(false, 0, null, null,4);
        //When

        //Then
        Assert.assertFalse(carro.getLigado());
    }

    @Test //Assert Not Null
    public void verificarSeTemDono(){
        //Given
        Carro carro = new Carro(false, 0, null, null,4);
        //When
        carro.setDono("Igor");
        //Then
        Assert.assertNotNull((carro.getDono()));
    }


    @Test //Assert Not Null
    public void verificarSeNaoTemDono(){
        //Given
        Carro carro = new Carro(false, 0, null, null,4);
        //When

        //O carro for zero e não tiver um dono

        //Then
        Assert.assertNull((carro.getDono()));
    }




    @Test // AssertEquals - Primativo
    public void verificarQuantidadePneus(){
        //Given
        Carro carro = new Carro(false, 0, null, null,5,5);
        //When
        int quantidadePneusCarroComum = 5;
        //Then
        Assert.assertEquals(carro.getQuantidadeDePneus(),quantidadePneusCarroComum);
    }

    @Test // AssertEquals - Primativo
    public void verificarQuantidadeAssentos(){
        //Given
        Carro carro = new Carro(false, 0, null, null,5,5);
        //When
        int quantidadeDeAssentosCarro = 5;
        //Then
        Assert.assertEquals(carro.getQuantidadeAssentos(),quantidadeDeAssentosCarro);
    }

    @Test // AssertEquals - Objeto
    public void verificarCarroParado(){
        //Given
        Carro carro = new Carro(false, 0, null, null,4);
        //When
        carro.ligarCarro();

        //Then
        Assert.assertEquals(carro.getVelocidadeAtual(),(Integer) 0);
    }
    @Test // AssertEquals - Objeto
    public void verificarLimiteDeVelocidadeDoCarro(){
        //Given
        Carro carro = new Carro(false, 80, null, null,4);
        //When
        Integer limiteDeVelocidade = 80;
        carro.ligarCarro();
        //Then
        Assert.assertEquals(carro.getVelocidadeAtual(), limiteDeVelocidade);
    }

    @Test
    public void verificarDonosSaoOsMesmos(){  //Given
        Carro carro = new Carro(false, 80, null, null,5,5);
        //When
        String [] donos = new String[]{"Pedro","Paulo","Igor","Jorge","Bruno"};
        String [] listaDonos = new String[]{"Pedro","Paulo","Igor","Jorge","Bruno"};
        carro.setDonos(donos);

        //Then
        Assert.assertArrayEquals(carro.getDonos(), listaDonos);
    }

    @Test // Assert Same
    public void verficarSeOsDonosSaoIguais(){

        //Given
        Carro carro = new Carro(false, 80, "Igor", null,5,5);
        Carro carro1 = new Carro(false, 80, "Igor", null,5,5);
        //When
        // Quando os dados são iguais - inicializados no construtor

        //Then
        Assert.assertSame(carro.getDono(),carro1.getDono());
    }

    @Test  // Assert Not Same
    public void verficarSeOsDonosNaoSaoIguais(){

        //Given
        Carro carro = new Carro(false, 80, "Igor", null,5,5);
        Carro carro1 = new Carro(false, 80, "Mascarenhas", null,5,5);
        //When
        // Quando os donos são não iguais - inicializados no construtor

        //Then
        Assert.assertNotSame(carro.getDono(),carro1.getDono());
    }
}
