/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import model.Provaaluno;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author bibim
 */
@FacesConverter(value = "provaalunoConverter")
public class ProvaalunoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value != null && !value.isEmpty()) {
            return (Provaaluno) uic.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
        if (value instanceof Provaaluno) {
            Provaaluno objt = (Provaaluno) value;
            if (objt != null && objt instanceof Provaaluno && objt.getIdProvaAluno()!= null) {
                uic.getAttributes().put(objt.getIdProvaAluno().toString(), objt);
                return objt.getIdProvaAluno().toString();
            }
        }
        return "";
    }
}