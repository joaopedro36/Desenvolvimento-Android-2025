package devandroid.joaopedro.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.joaopedro.applistacurso.model.Pessoa;

public class PessoaControler {

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciada");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller", "Salvo: "+pessoa.toString());
    }
}
