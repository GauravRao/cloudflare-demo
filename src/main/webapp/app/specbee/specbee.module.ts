import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CloudflareSharedModule } from 'app/shared';
import { specbeeRoutes } from 'app/specbee/specbee.route';
import { CloudflareComponent } from 'app/specbee/cloudflare/cloudflare.component';
import { CloudflareService } from 'app/specbee/cloudflare/cloudflare.service';

@NgModule({
    imports: [CloudflareSharedModule, RouterModule.forChild(specbeeRoutes)],
    declarations: [CloudflareComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SpecbeeModule {}
