% [true*]true && <true>true
% forall d:Nat.[action1(d)]false
% [true*][P.(!S || Q)*.R]false

% [true*][P.(!S)*.R]false
% this would be equal to:
% [true*.P.(R + (!S)+.R)]false
% [A.!(B || C(5)) && (E||F).true.F*]false