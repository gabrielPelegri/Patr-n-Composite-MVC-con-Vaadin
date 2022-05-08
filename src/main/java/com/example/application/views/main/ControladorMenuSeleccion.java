package com.example.application.views.main;

import org.hibernate.validator.spi.nodenameprovider.Property;

public class ControladorMenuSeleccion extends Controlador   
    implements   
    Property.ValueChangeListener {   
  private static final long serialVersionUID = 1L;   
   
  public ControladorMenuSeleccion(BaseVehiculos modelo) {   
    super();   
    this.modelo = modelo;   
  }   
   
  public void valueChange(ValueChangeEvent event) {   
    BaseVehiculos.VehiculoDescription nuevaDescripcion =   
        (BaseVehiculos.VehiculoDescripcion) event   
            .getProperty().getValue();   
    if (nuevaDescripcion != null)   
      modelo.setIndiceVehiculoEnCurso(nuevaDescripcion   
          .getIndice());   
  }   
   
  public void actualiza() {   
  }   
}
