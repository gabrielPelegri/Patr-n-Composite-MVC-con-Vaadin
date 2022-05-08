package com.example.application.views.main;

import com.example.application.views.main.BaseVehiculos.VehiculoDescripcion;
import com.vaadin.flow.component.HasValue.ValueChangeEvent;

import org.hibernate.validator.spi.nodenameprovider.Property;

public class ControladorMenuSeleccion extends Controlador   
    implements   
     {   
  private static final long serialVersionUID = 1L;   
   
  public ControladorMenuSeleccion(BaseVehiculos modelo) {   
    super();   
    this.modelo = modelo;   
  }   
   
  public void valueChange(ValueChangeEvent event) {   
    VehiculoDescripcion nuevaDescripcion =   
        (BaseVehiculos.VehiculoDescripcion) event   
            .getProperty().getValue();   
    if (nuevaDescripcion != null)   
      modelo.setIndiceVehiculoEnCurso(nuevaDescripcion   
          .getIndice());   
  }   
   
  public void actualiza() {   
  }   
}
