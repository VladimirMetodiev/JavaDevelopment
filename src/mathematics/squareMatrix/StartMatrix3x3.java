package mathematics.squareMatrix;

public class StartMatrix3x3 {
    public static void main(String[] args) {

        SquareMatrix3x3 matrix = new SquareMatrix3x3();

        matrix.fillTheMatrix();
        matrix.print();
        matrix.calculateTrace();
        matrix.calculateDeterminant();
        matrix.turn();
        matrix.print();
    }
}



//Tests

// Determinant

// | 5 | = 5

// | 7 3 | = 53
// | 1 8 |

// | 12 37 | = -173
// | 29 75 |

// | 1 4 7 |
// | 2 5 8 | = 0
// | 3 6 9 |

// | 1  8 6 |
// |-6 12 1 | = 26
// | 5  2 7 |

// |  9 14  30 |
// | 50 42   6 | = -6912
// | 19  8 -12 |

// |  9 14  30 -1 |
// | 50 42   6 21 | = 45210
// | 19  8 -12  7 |
// |  4 35  48  2 |

// |  9 14  30 -1 6 |
// | 50 42   6 21 4 |
// | 19  8 -12  7 1 | = 390474
// |  4 35  48  2 5 |
// | 12 61 -28 15 7 |

