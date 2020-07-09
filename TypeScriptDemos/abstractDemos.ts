import { Implementor, Requirement } from './requirement';
import { MyInterface, MyImplementor } from './interfaceDemo';

let i:Requirement = new Implementor();

i.display();
i.reqruirement1();

let i2:MyInterface = new MyImplementor();

i2.requirement1();
i2.requirement2();
i2.requirement3();