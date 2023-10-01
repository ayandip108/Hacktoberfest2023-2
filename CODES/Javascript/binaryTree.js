class Node {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

function createNode(data) {
    return new Node(data);
}

function insertNode(root, data) {
    if (root === null) {
        return createNode(data);
    }

    if (data < root.data) {
        root.left = insertNode(root.left, data);
    } else if (data > root.data) {
        root.right = insertNode(root.right, data);
    }

    return root;
}

function inorder(root) {
    if (root === null) {
        return;
    }

    inorder(root.left);
    console.log(root.data + " -> ");
    inorder(root.right);
}

function preorder(root) {
    if (root === null) {
        return;
    }

    console.log(root.data + " -> ");
    preorder(root.left);
    preorder(root.right);
}

function postorder(root) {
    if (root === null) {
        return;
    }

    postorder(root.left);
    postorder(root.right);
    console.log(root.data + " -> ");
}

let root = null;
root = insertNode(root, 50);
insertNode(root, 30);
insertNode(root, 20);
insertNode(root, 40);
insertNode(root, 70);
insertNode(root, 60);
insertNode(root, 80);

console.log("Inorder traversal:");
inorder(root);
console.log("\n");

console.log("Preorder traversal:");
preorder(root);
console.log("\n");

console.log("Postorder traversal:");
postorder(root);
console.log("\n");
