import { BaseEntity } from './../../shared';

export class RfbLocation implements BaseEntity {
    constructor(
        public id?: number,
        public regionName?: string,
        public runDayOfWeek?: number,
        public rvbEvents?: BaseEntity[],
    ) {
    }
}
