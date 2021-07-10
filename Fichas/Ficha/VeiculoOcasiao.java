import java.util.*;


public class VeiculoOcasiao extends Veiculo{
   private boolean promocao;



    public VeiculoOcasiao(){

        super();

        this.promocao = false;

    }



    public VeiculoOcasiao(String marca, String modelo, String matricula, int ano, double velociademedia, double precokm, ArrayList<Integer> classificacao, int kms, int kmsUltimo, boolean promocao) {

        super(marca, modelo, matricula, ano, velociademedia, precokm, classificacao, kms, kmsUltimo);

        this.promocao = promocao;

    }



    public VeiculoOcasiao(VeiculoOcasiao vo){

        super(vo.getMarca(),vo.getModelo(),vo.getMatricula(),vo.getAno(),vo.getVelociademedia(),vo.getPrecokm(),vo.getClassificacao(),vo.getKms(),vo.getKmsUltimo());

        this.promocao = vo.getPromocao();

    }



    public boolean getPromocao() {

        return promocao;

    }



    public void setPromocao(boolean promocao) {

        this.promocao = promocao;

    }
    
    public double custoRealKM() {

        return super.custoRealKM() * 0.75;

    }
}
