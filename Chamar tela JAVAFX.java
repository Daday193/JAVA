		//Chamar próxima tela.
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/oficinamecanica/FXMLPrincipal.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        //stage.setMaximized(true);
        stage.setTitle("Tela Principal");
        
        //Fecha a tela atual para abrir a próxima.
        btnEntrar.getScene().getWindow().hide();
        