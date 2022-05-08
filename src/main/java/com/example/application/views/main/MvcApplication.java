package com.example.application.views.main;
public class MvcApplication extends Application {   
    private static final long serialVersionUID = 1L;   
     
      
    public void init() {   
      Window mainWindow = new Window("Mvc Application");   
      BaseVehiculos modelo = new BaseVehiculos();   
      VistaPrincipal mainView = new VistaPrincipal(modelo);   
      mainWindow.addComponent(mainView);   
      setMainWindow(mainWindow);   
    }   
  }