/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import model.Resposta;
import dao.RespostaDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author bibim
 */
@ManagedBean
@ViewScoped
public class RespostaBean{
    
    Resposta resposta = new Resposta();
    List respostas = new ArrayList();

    public RespostaBean() {
        respostas = new RespostaDao().buscarTodas();
        resposta = new Resposta();
    } 
    
    //Métodos dos botões 
    public void record(ActionEvent actionEvent) {
        new RespostaDao().persistir(resposta);
        respostas = new RespostaDao().buscarTodas();
        resposta = new Resposta();
    }

    //getters and setters
    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public List getRespostas() {
        return respostas;
    }

    public void setRespostas(List respostas) {
        this.respostas = respostas;
    }
        
}
