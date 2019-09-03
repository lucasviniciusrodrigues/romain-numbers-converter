package utils;


public class ValidateBadRequest {

    String[] errors = {"IIII","VVVV","XXXX","LLLL","CCCC","DDDD","MMMM"
            , "IC", "ID", "IM"
            , "VV", "VX", "VL", "VC", "VD", "VM"
            , "XD", "XM"
            , "LC", "LD", "LM"
            , "DM"};

    public ValidateBadRequest(String input) throws Exception {

        for ( String aux : errors) {
            if(input.contains(aux)){
                throw new Exception("Valor invalido a entrada contém: " + aux);
            }
        }

    }
}
