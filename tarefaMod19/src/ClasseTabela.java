
public class ClasseTabela {
    
    @AnotacaoTabela(value = "Tabela Exemplo")
    private String tabela;

    public ClasseTabela(String tabela) {
        this.tabela = tabela;
    }

    /**
     * @return String return the tabela
     */
    public String getTabela() {
        return tabela;
    }

    /**
     * @param tabela the tabela to set
     */
    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

}
