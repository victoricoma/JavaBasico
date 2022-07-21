package aula8;

public enum TipoDocumento {
    CPF{
        @Override
        public String gerarNumeroTeste(){
            return GeraCpfCnpj.cpf();
        }
    },
    CNPJ{
        @Override
        public String gerarNumeroTeste(){
            return GeraCpfCnpj.cnpj();
        }
    };
    public abstract String gerarNumeroTeste();
}