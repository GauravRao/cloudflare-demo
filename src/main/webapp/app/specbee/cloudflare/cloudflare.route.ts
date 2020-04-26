import { Route } from '@angular/router';

import { UserRouteAccessService } from 'app/core';
import { CloudflareComponent } from 'app/specbee';

export const cloudflareRoute: Route = {
    path: 'cloudflare',
    component: CloudflareComponent,
    data: {
        authorities: ['ROLE_USER'],
        pageTitle: 'Clear Cache'
    },
    canActivate: [UserRouteAccessService]
};
