
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class GroupMember implements Serializable{
    String aliasMiembro;
    String hostname;
    int idMiembro;
    int idGrupo;
    
    public GroupMember(String aliasMiembro, String hostname, int idMiembro, int idGrupo){
        this.aliasMiembro = aliasMiembro;
        this.hostname = hostname;
        this.idGrupo = idGrupo;
        this.idMiembro = idMiembro;
        
        
    }
}
