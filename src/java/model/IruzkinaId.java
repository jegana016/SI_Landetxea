package model;
// Generated 04-ene-2016 15:44:54 by Hibernate Tools 4.3.1



/**
 * IruzkinaId generated by hbm2java
 */
public class IruzkinaId  implements java.io.Serializable {


     private String landetxeaId;
     private String erabIzena;
     private String testua;

    public IruzkinaId() {
    }

    public IruzkinaId(String landetxeaId, String erabIzena, String testua) {
       this.landetxeaId = landetxeaId;
       this.erabIzena = erabIzena;
       this.testua = testua;
    }
   
    public String getLandetxeaId() {
        return this.landetxeaId;
    }
    
    public void setLandetxeaId(String landetxeaId) {
        this.landetxeaId = landetxeaId;
    }
    public String getErabIzena() {
        return this.erabIzena;
    }
    
    public void setErabIzena(String erabIzena) {
        this.erabIzena = erabIzena;
    }
    public String getTestua() {
        return this.testua;
    }
    
    public void setTestua(String testua) {
        this.testua = testua;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof IruzkinaId) ) return false;
		 IruzkinaId castOther = ( IruzkinaId ) other; 
         
		 return ( (this.getLandetxeaId()==castOther.getLandetxeaId()) || ( this.getLandetxeaId()!=null && castOther.getLandetxeaId()!=null && this.getLandetxeaId().equals(castOther.getLandetxeaId()) ) )
 && ( (this.getErabIzena()==castOther.getErabIzena()) || ( this.getErabIzena()!=null && castOther.getErabIzena()!=null && this.getErabIzena().equals(castOther.getErabIzena()) ) )
 && ( (this.getTestua()==castOther.getTestua()) || ( this.getTestua()!=null && castOther.getTestua()!=null && this.getTestua().equals(castOther.getTestua()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLandetxeaId() == null ? 0 : this.getLandetxeaId().hashCode() );
         result = 37 * result + ( getErabIzena() == null ? 0 : this.getErabIzena().hashCode() );
         result = 37 * result + ( getTestua() == null ? 0 : this.getTestua().hashCode() );
         return result;
   }   


}


