import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ProductService {
  constructor(private http: HttpClient) { }

    url : string = "http://localhost:8081/product";


    addProduct(product : any){
        
        this.http.post(this.url, product, {}).subscribe();
    }

    getProduct(id : number){
       return this.http.get(this.url +"/"+id);
        
    }

}