package com.roque.voll.api_clinica_medica.domain.paciente;

import com.roque.voll.api_clinica_medica.domain.endereco.Endereco;

public class Acompanhante  extends Paciente{
    private Boolean parentesco;

    public Acompanhante(Boolean parentesco) {
        this.parentesco = parentesco;
    }

    public Acompanhante(String cpf, String nome, String sobreNome, String dataNascimento, String email, Endereco endereco, Boolean parentesco) {
        super(cpf, nome, sobreNome, dataNascimento, email, endereco);
        this.parentesco = parentesco;
    }

    public Boolean getParentesco() {
        return parentesco;
    }

    public void setParentesco(Boolean parentesco) {
        this.parentesco = parentesco;
    }
}
