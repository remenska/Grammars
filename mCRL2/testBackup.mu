% [true*]true && <true>true
% forall d:Nat.[action1(d)]false
% [true*][P.(!S || Q)*.R]false

% [true*][P.(!S)*.R]false
% this would be equal to:
% [true*.P.(R + (!S)+.R)]false
% [A.!(B || C(5)) && (E||F).true.F*]false

[forall d:Bool.(dd(b) || dd(false))]false
forall d,f:Nat.[action1(d).action2.action3(d)]false
[action1(2).forall s:Bool.dd(s)]false
forall d:Nat,f:Nat.[action1(d).action2.action3(f).forall s:Nat.action1(s)]false
