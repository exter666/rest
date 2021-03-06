package io.swagger.api;

import io.swagger.model.PaymentLists;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-10T01:22:07.540+03:00")

@Controller
public class AddPaymentListsApiController implements AddPaymentListsApi {

    public ResponseEntity<Void> addPaymentLists(

@ApiParam(value = "пакет расчетных листков" ,required=true ) @RequestBody PaymentLists string

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
