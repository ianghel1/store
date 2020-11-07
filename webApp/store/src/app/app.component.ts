import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ProductService } from './product.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'store';
  productForm : FormGroup;
  productFormGet : FormGroup;

  constructor(
       private formBuilder: FormBuilder, private productService : ProductService) {
        this.productForm = this.formBuilder.group({
          name: '',
          price: ''
        });

        this.productFormGet = this.formBuilder.group({
          productId : ''
        });
  }

  onSubmit(){ 
    
    this.productService.addProduct({name : this.productForm.get("name").value, price : this.productForm.get("price").value});
  }

  onSubmitGet(){
    this.productService.getProduct(this.productFormGet.get('productId').value).subscribe(response => {
      console.log(response)
    }, err => {
      console.error(err);
    });
  }

}
