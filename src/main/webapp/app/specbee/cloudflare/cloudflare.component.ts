import { Component, OnInit } from '@angular/core';

import { Principal } from 'app/core';
import { CloudflareService } from 'app/specbee';

@Component({
    selector: 'jhi-cloudflare',
    templateUrl: './cloudflare.component.html'
})
export class CloudflareComponent implements OnInit {
    error: string;
    success: string;
    account: any;

    constructor(private cloudflareService: CloudflareService, private principal: Principal) {
        console.log(this.cloudflareService);
    }

    ngOnInit() {
        this.principal.identity().then(account => {
            this.account = account;
        });
    }

    clearCache() {
        this.cloudflareService.clearCache().subscribe(
            () => {
                this.error = null;
                this.success = 'OK';
            },
            () => {
                this.success = null;
                this.error = 'ERROR';
            }
        );
    }
}
