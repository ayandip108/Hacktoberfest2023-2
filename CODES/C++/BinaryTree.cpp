//Binary Tree
#include <iostream>
using namespace std;

struct Node
{
    int data;
    Node *left;
    Node *right;
};

Node *createNode(int data)
{
    Node *newNode = new Node();
    if (!newNode)
    {
        cout << "Memory Error!!";
        return NULL;
    }
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

Node *insertNode(Node *root, int data)
{
    if (root == NULL)
    {
        root = createNode(data);
        return root;
    }
    if (data < root->data)
    {
        root->left = insertNode(root->left, data);
    }
    else if (data > root->data)
    {
        root->right = insertNode(root->right, data);
    }
    return root;
}

void inorder(Node *root)
{
    if (root == NULL)
    {
        return;
    }
    inorder(root->left);
    cout << root->data << "->";
    inorder(root->right);
}

void preorder(Node *root)
{
    if (root == NULL)
    {
        return;
    }
    cout << root->data << "->";
    preorder(root->left);
    preorder(root->right);
}

void postorder(Node *root)
{
    if (root == NULL)
    {
        return;
    }
    postorder(root->left);
    postorder(root->right);
    cout << root->data << "->";
}

int main()
{
    Node *root = NULL;
    root = insertNode(root, 50);
    insertNode(root, 30);
    insertNode(root, 20);
    insertNode(root, 40);
    insertNode(root, 70);
    insertNode(root, 60);
    insertNode(root, 80);
    cout << "Inorder traversal" << endl;
    inorder(root);
    cout << endl;
    cout << "Preorder traversal" << endl;
    preorder(root);
    cout << endl;
    cout << "Postorder traversal" << endl;
    postorder(root);
    cout << endl;
    return 0;
}

