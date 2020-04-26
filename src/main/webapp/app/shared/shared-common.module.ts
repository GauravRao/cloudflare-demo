import { NgModule } from '@angular/core';

import { CloudflareSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [CloudflareSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [CloudflareSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class CloudflareSharedCommonModule {}
