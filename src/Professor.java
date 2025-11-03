public final class Professor extends Pessoa {
    private String especialidade;
    public CARGO cargo;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public  String toString(){
        return super.toString() + ", Especialidade: " +
                especialidade;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou professor");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Ensinar");
    }

    public CARGO getCargo() {
        return cargo;
    }
}